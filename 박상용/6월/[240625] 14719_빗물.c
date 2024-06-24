#define _CRT_SECURE_NO_WARNINGS 
#include<stdio.h>
#include<stdlib.h>

int max(int a, int b) {
    return (a > b) ? a : b;
}

int min(int a, int b) {
    return (a < b) ? a : b;
}

int main() {
    int h, w;
    scanf("%d %d",&h, &w);
    
    // C���� ���� �迭 ����� �迭�� ũ�⸦ ������ Ÿ�ӿ� �����ϱ� ������ malloc ���
    int* arr = (int*)malloc(w * sizeof(int));
  
    for (int i = 0; i < w; i++) scanf("%d", &arr[i]);
    
    int result = 0;
    for (int i = 1; i < w - 1; i++) {
        int lt = 0, rt = 0;
        for (int j = 0; j < i; j++) lt = max(lt, arr[j]);
        for (int j = w - 1; j > i; j--) rt = max(rt, arr[j]);
        result += max(0, min(lt, rt) - arr[i]);
    }
   
    printf("%d", result);
}
