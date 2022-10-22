//g++ -O2 -std=c++17 -Wall -Wl,--stack,26843546 template.cpp -o name && name
#include<bits/stdc++.h>   //c++ stl 
using namespace std;      //using namespace prevents need for std::cin or others

#define ar array
#define ll long long
#define ld long double
#define sz(x) ((int)x.size())
#define all(a) (a).begin(), (a).end()
//INT_MAX
//INT_MIN
//LLONG_MAX
//LLONG_MIN
const ll MOD = 1e9 + 7;
const ll INF = 1e9;
const ld EPS = 1e-9;

int main(){
    ios::sync_with_stdio(0);  //decouples c and c++ streams for speed since scanf/printf is faster than cin/cout
    cin.tie(0);               //decouples cin and cout streams for speed
    int n; cin >> n;
    int nphotos = 0;
    vector<int> v;
    for(int i = 0; i < n; i++){
        int num; cin >> num;
        int arr[num];
        int t;
        for(int j = 0; j < num; j++){
            cin >> t;
            arr[j] = t;
        }
        stack<int> stack;
        int l = INT_MAX;
        for(int k = 0; k < num; k++){
            if(stack.empty())
                stack.push(arr[k]);
            else if(arr[k] < stack.top()){
                while(!stack.empty() && arr[k] < stack.top()){
                    l = min(stack.top(), l);
                    stack.pop();
                }
                stack.push(arr[k]);
            }
            else
                stack.push(arr[k]);
            if(arr[k] > l){
                nphotos++;
                v.push_back(i+1);
                break;
            }
        }
    }
    cout << nphotos << "\n";
    for(int i : v){
        cout << i << "\n";
    }
}