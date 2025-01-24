#include <iostream>
using namespace std;

/**
 * 
 * Count Digits is a number;
 * 
 */

int countDigits (int num) {
	int cnt = 0;
	while(num > 0) {
		num /= 10;
		cnt++;
	}
	return cnt;
}

int main() {
	int n = 0;
	cin >> n;
	cout << countDigits(n);
}