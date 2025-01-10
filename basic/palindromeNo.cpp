#include <iostream>
using namespace std;

/**
 * 
 * Check if the number is palindrome or not;
 * 
 */

bool isPalindrome (int num) {

	int org = num, i = 10, rev = 0;

	while (num > 0) {
		rev = (rev * i) + (num % 10);
		num /= 10;
	}
	cout << rev << "\n";
	return (rev == org);
}

int main() {
	int n = 0;
	cin >> n;
	cout << isPalindrome(n);
}