#include <Stdio.h>


int binary_search(int s, int e, int arr[], int x)
{
	int m;
	if (s == e)
		if (arr[s] == x)
			return s;
		else
			return NULL;
	m = (s + e) / 2;
	if (arr[m] == x)
		return m;
	else if (arr[m] > x)
		return binary_search(s, m - 1, arr, x);
	else
		return binary_search(m + 1, e, arr, x);
}
int main(void) {
	int arr[]= { 1,2,3,4,5,6,7,8,9,10 };
	int x; 
	printf("ã���� �ϴ� ���� �Է����ּ��� : ");
	scanf("%d", &x);

	printf("�迭�� %d ��° �ε����� ���� ",binary_search(0, sizeof(arr) / sizeof(int), arr, x));
	

}