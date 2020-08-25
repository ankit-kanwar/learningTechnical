#include<iostream>
#include<string>
#include<sstream>
//#include<stdlib.h>

using namespace std;
int main(){
    //system("clear");
    //printf("\e[1;1H\e[2J");
    ios_base::sync_with_stdio(false); // disable sync of stdio and iostream for better performance
    cin.tie(NULL); // turn off feature of emptyng output buffer before input

    for(int i=0;i<=2;i++){
        printf("from printf \n"); 
        cout << "from cout " << endl;        
    }

    int input;
    cin >> input;
    cout << input << endl;

    return 0;
    
}