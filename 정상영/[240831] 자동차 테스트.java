import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        int q = sc.nextInt();

        int[] rates = new int[n];

        for(int i = 0; i < n; i++) {
            rates[i] = sc.nextInt();
        }

        Arrays.sort(rates);

        for(int i = 0; i < q; i++) {
            int input = sc.nextInt();
            int idx = -1;
            
            for(int j = 0; j < n; j++) {
                if(rates[j] == input) {
                    idx = j;
                    break;
                }
            }
            if(idx == -1) sb.append(0);
            else {
                int cases = idx * (rates.length - idx - 1);
                sb.append(cases);
            }

            sb.append("\n");
        }

        System.out.println(sb);
    }
}


/*
Subtask 1
NO	이름	결과	실행시간	메모리
1	001-1	정답
0.114 초	11.90 MB
2	002-1	정답
0.103 초	11.98 MB
3	003-1	정답
0.404 초	47.77 MB
4	004-1	정답
0.405 초	48.43 MB
5	005-1	정답
0.397 초	49.58 MB
6	006-1	정답
0.409 초	48.04 MB
7	007-1	정답
0.412 초	48.17 MB
8	008-1	정답
0.402 초	50.06 MB
9	009-1	정답
0.396 초	47.91 MB
10	010-1	정답
0.389 초	48.18 MB
11	011-1	정답
0.444 초	47.29 MB
12	012-1	정답
0.405 초	49.70 MB
13	013-1	정답
0.428 초	47.56 MB
14	014-1	정답
0.412 초	47.87 MB
15	015-1	정답
0.420 초	49.90 MB
16	016-1	정답
0.436 초	49.15 MB
17	017-1	정답
0.412 초	48.16 MB
18	018-1	정답
0.401 초	47.89 MB
19	019-1	정답
0.445 초	49.65 MB
20	020-1	정답
0.405 초	49.61 MB

Subtask 2
NO	이름	결과	실행시간	메모리
1	021-2	정답
2.176 초	58.74 MB
2	022-2	정답
2.509 초	58.31 MB
3	023-2	정답
2.112 초	54.07 MB
4	024-2	정답
1.984 초	54.07 MB
5	025-2	정답
2.589 초	56.61 MB
6	026-2	정답
2.567 초	55.76 MB
7	027-2	정답
2.397 초	55.39 MB
8	028-2	정답
2.044 초	56.41 MB
9	029-2	정답
2.554 초	56.45 MB
10	030-2	정답
1.853 초	53.80 MB
11	031-2	정답
2.215 초	55.95 MB
12	032-2	정답
2.261 초	59.02 MB
13	033-2	정답
2.431 초	56.20 MB
14	034-2	정답
2.707 초	54.98 MB
15	035-2	정답
1.527 초	54.07 MB
16	036-2	정답
1.898 초	54.08 MB
17	037-2	정답
2.538 초	56.32 MB
18	038-2	정답
2.413 초	55.64 MB
19	039-2	정답
1.682 초	54.54 MB
20	040-2	정답
1.972 초	55.73 MB

Subtask 3
NO	이름	결과	실행시간	메모리
1	041-3	정답
2.427 초	58.40 MB
2	042-3	정답
2.088 초	54.34 MB
3	043-3	정답
2.042 초	55.99 MB
4	044-3	정답
2.670 초	56.24 MB
5	045-3	정답
2.188 초	56.27 MB
6	046-3	정답
1.944 초	56.00 MB
7	047-3	정답
2.156 초	56.02 MB
8	048-3	정답
1.807 초	54.10 MB
9	049-3	정답
2.196 초	56.00 MB
10	050-3	정답
1.682 초	53.97 MB
11	051-3	정답
2.110 초	56.16 MB
12	052-3	정답
2.265 초	55.52 MB
13	053-3	정답
1.819 초	54.17 MB
14	054-3	정답
2.401 초	55.28 MB
15	055-3	정답
1.857 초	54.09 MB
16	056-3	정답
2.013 초	56.05 MB
17	057-3	정답
1.914 초	54.15 MB
18	058-3	정답
2.578 초	58.77 MB
19	059-3	정답
2.390 초	55.71 MB
20	060-3	정답
2.225 초	54.26 MB
*/
