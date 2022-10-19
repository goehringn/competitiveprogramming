//g++ -O2 -std=c++17 -Wall -Wl,--stack,26843546 template.cpp -o name && name
#include<bits/stdc++.h>   //c++ stl 
using namespace std;      //using namespace prevents need for std::cin or others

#define ar array
#define ll long long
#define ld long double
#define sz(x) ((int)x.size())
#define all(a) (a).begin(), (a).end()

const int MAX_N = 1e5 + 5;
const ll MOD = 1e9 + 7;
const ll INF = 1e9;
const ld EPS = 1e-9;

int main(){
    ios::sync_with_stdio(0);  //decouples c and c++ streams for speed since scanf/printf is faster than cin/cout
    cin.tie(0);               //decouples cin and cout streams for speed
    //int n;
    //cin >> n;
    //for(int i = 0; i < n; i++){    
    //}
    int n, k;
    cin >> n >> k;
    int p = 0;
    int num;
    while(p < k && cin >> num && num > 0){
        p++;
    }
    int nnum = 0;
    while(p < n && cin >> nnum && nnum == num && nnum > 0)
        p++;
    cout << p;
}