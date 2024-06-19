#define _CRT_SECURE_NO_WARNINGS // ���� ������ scanf�� ����� �� ���
#include<stdio.h>
#include<string.h> // strlen ������ �ش� ���̺귯�� ���
#include<math.h> // pow ������ �ش� ���̺귯�� ���

int arr[26]; // ���ĺ� 26��

int compare(int* a, int* b) {
	return *b - *a; // �������� ����
}

int main() {
	int n; // �ܾ��� ����
	int res = 0; // ����� ���� ����
	char num[10]; // �ܾ��� ũ��� 9�ڸ� ����
	scanf("%d", &n);

	for (int i = 0; i < n; i++) {
		scanf("%s", num);
		int len = strlen(num); // �Է¹��� ������ ���� ����
		for (int j = 0; j < len; j++) {
			int tmp = num[j] - 'A'; // j��° �ڸ��� � �������� �Ǻ�
			arr[tmp] += pow(10, len - 1 - j); // ũ�� ��ŭ �־��ֱ�
		}
	}

	qsort(arr, 26, sizeof(int), compare); // qsort(�迭, ����� ����, ����� ũ��, ���� �Լ�)

	for (int i = 9; i > 0; i--) 
		res += arr[(9-i)] * i;

	printf("%d", res); // ���
}