const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

let N = 0;
const inputLines = [];
const queues = { 'A': [], 'B': [], 'C': [], 'D': [] };
const result = [];

rl.on('line', (line) => {
  if (N === 0) {
    N = parseInt(line);
  } else {
    inputLines.push(line);
    if (inputLines.length === N) {
      rl.close();
    }
  }
});

rl.on('close', () => {
  inputLines.forEach((line, index) => {
    const [time, direction] = line.split(' ');
    queues[direction].push({ time: parseInt(time), index });
    result.push(-1);
  });

  let currentTime = 0;
  const carList = { 'A': null, 'B': null, 'C': null, 'D': null };

    for (const dir of ['A', 'B', 'C', 'D']) {
      while (queues[dir].length > 0 && queues[dir][0].time <= currentTime) {
        const { time, index } = queues[dir].shift();
        const rightDir = { 'A': 'D', 'B': 'A', 'C': 'B', 'D': 'C' }[dir];
        carList[dir] = { time, index };

        if (carList[rightDir] !== null) {
          const { rtTime, rtIndex } = queues[rightDir].shift();
          carList[rightDir] = { rtTime, rtIndex };
        }
      }

    // 교차로를 통과할 차량을 결정
    let carCnt = 0;
    for (const dir of ['A', 'B', 'C', 'D']) {
      if (carList[dir] !== null) {
        const { time, index } = carList[dir];
        result[index] = currentTime;
        carList[dir] = null;
        carCnt++;
      }
    }
    currentTime++;
  }
  console.log(result.join('\n'));
});