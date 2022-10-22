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
    unordered_map<char, int> dom = {
        {'A',11},
        {'K',4},
        {'Q', 3},
        {'J', 20},
        {'T', 10},
        {'9', 14},
        {'8', 0},
        {'7',0}
    };
    unordered_map<char, int> ndom = {
        {'A',11},
        {'K',4},
        {'Q', 3},
        {'J', 2},
        {'T', 10},
        {'9', 0},
        {'8', 0},
        {'7',0}
    };
    int a; cin >> a;
    char d; cin >> d;
    string s;
    int count = 0;
    while(cin >> s){
        if(s.at(1) == d){
            count += dom[s.at(0)];
        }
        else
            count += ndom[s.at(0)];
    }
    cout << count;
}