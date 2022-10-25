//g++ -O2 -std=c++17 -Wall -Wl,--stack,26843546 template.cpp -o name && name
#include<bits/stdc++.h>   //c++ stl 
using namespace std;      //using namespace prevents need for std::cin or others

//INT_MAX
//INT_MIN
//LLONG_MAX
//LLONG_MIN
//DBL_MAX
//DBL_MIN
typedef long long ll;
typedef long double ld;

#define ar array
#define all(a) (a).begin(), (a).end()
#define rall(m) m.rbegin(), m.rend()
#define F first
#define S second
#define vec vector
#define pub push_back
#define pob pop_back
#define pll pair<ll, ll>
#define pdd pair<ld, ld>
#define pii pair<int, int>
#define lsz(m) (ll)m.size()
#define isz(m) (int)m.size()
#define pnn pair<Node*, Node*>
#define uid uniform_int_distribution
#define timeStamp() std::chrono::steady_clock::now()
#define unify(m) sort(all(m)); m.erase(unique(all(m)), m.end());
#define duration_micro(a) chrono::duration_cast<chrono::microseconds>(a).count()
#define duration_milli(a) chrono::duration_cast<chrono::milliseconds>(a).count()
#define vi vec<int>
#define vl vec<ll>
#define vvi vec<vec<int>>
#define vvvi vec<vec<vec<int>>>
#define vvl vec<vec<ll>>
#define vpi vec<pii>
#define vpl vec<pll>
#define vs vec<string>
#define vvs vec<vec<string>>

const int dx[] = { -1, 0, 1, 0, -1, 1, 1, -1};
const int dy[] = {0, 1, 0, -1, 1, 1, -1, -1};
const ll MOD = 1e9 + 7;
const ll INF = 1e9;
const ld EPS = 1e-9;

int main(){
    ios::sync_with_stdio(0);  //decouples c and c++ streams for speed since scanf/printf is faster than cin/cout
    cin.tie(0);               //decouples cin and cout streams for speed
    int n;
    cin >> n;
    int t; cin >> t;
    int arr[n];
    int num;
    for(int i = 0; i < n; i++){
        cin >> num;
        arr[i] = num;
    }
    if(t == 1){
        bool nf = true;
        unordered_set<int> set;
        for(int i : arr){
            set.insert(i);
            if(set.count(7777-i) == 1 && 7777-i != i){
                cout << "Yes";
                nf = false;
                break;
            }
        }
        if(nf)
            cout << "No";
    }
    else if(t == 2){
        bool nf = true;
        unordered_set<int> set;
        for(int i = 0; i < n; i++){
            auto p = set.insert(arr[i]);
            if(p.second == false){
                cout << "Contains duplicate";
                nf = false;
                break;
            }
        }
        if(nf)
            cout << "Unique";
    }
    else if(t == 3){
        bool nf = true;
        unordered_map<int,int> map;
        for(int i : arr)
            map[i]++;
        for(auto i : map){
            if(i.second > n/2){
                cout << i.first;
                nf = false;
                break;
            }
        }
        if(nf)
            cout << -1;
    }
    else if(t==4){
        sort(arr, arr+n);
        if(n%2 == 0){
            cout << arr[n/2-1] << " " << arr[n/2];
        }
        else
            cout << arr[n/2];
    }
    else{
        sort(arr, arr+n);
        for(int i = 0; i < n; i++){
            if(arr[i] >= 100 && arr[i] <= 999){
                cout << arr[i] << " ";
            }
        }
    }
}

