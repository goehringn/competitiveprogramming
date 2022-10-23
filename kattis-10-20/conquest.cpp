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

//create adjacency matrix and add all edges
//go from first to last looking for edges that are possible
//if path is complete mark all as visited
//if island is added to total 
//keep while loop running if army size is updated
//if army size does not update on a round then exit and return the total army size

int main(){
    ios::sync_with_stdio(0);  //decouples c and c++ streams for speed since scanf/printf is faster than cin/cout
    cin.tie(0);               //decouples cin and cout streams for speed
    int n;
    cin >> n;
    int m; cin >> m;
    int matrix[n+1][n+1];
    for(int i = 0; i < m; i++){
        cout << n;
    }
}