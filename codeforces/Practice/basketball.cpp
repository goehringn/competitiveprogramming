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
    cin.tie(NULL);            //decouples cin and cout streams for speed
    char p;
    unordered_map<char, int> map;
    while(cin >> p){
        int s;
        cin >> s;
        map[p] += s;
        if(s == 2 && map['A'] == 11){
            cout << "A";
            break;
        }
        else if(s == 2 && map['B'] == 11){
            cout << "B";
            break;
        }
        else if(map['B'] >= 11 && map['A'] < 10){
            cout << "B";
            break;
        }
        else if(map['A'] >= 11 && map['B'] < 10){
            cout << "A";
            break;
        }
        else if(map['A'] == 10 && map['B'] == 10){
            while(cin >> p){
                cin >> s;
                map[p] += s;
                if(map['A'] - map['B'] > 1){
                    cout << "A";
                    break;
                }
                else if(map['B'] - map['A'] > 1){
                    cout << "B";
                    break;
                }
            }
            break;
        }
    }
}