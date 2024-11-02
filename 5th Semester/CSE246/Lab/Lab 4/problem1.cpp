#include <iostream>
using namespace std;

int main(){

    char text[] = "The quick brown fox jumps over the lazy dog";
    char pattern[] = "fox";

    int n = strlen(text);
    int m = strlen(pattern);


    for(int i=0;i < n-m; i++){
        int j;
        for(j=0;j<m;j++){
            if(pattern[j] != text[i+j]){
                    break;
            }
        }
        if(j==m){
            cout << "Pattern found at index: " << i;
        }


    }

    return 0;
}
