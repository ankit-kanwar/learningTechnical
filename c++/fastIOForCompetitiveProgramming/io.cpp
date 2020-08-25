#include<iostream>
#include<string>
#include<sstream>

using namespace std;
int main(){
    int num;
    string input;
    cout<<"Enter number :";
    getline(cin,input);
    stringstream(input) >> num;
    cout << "Number is " << num << endl;

    string name;
    cout<<"Enter name :";
    getline (cin,name);
    cout<<"Name is "<<name << endl;

    /*string mystr;
    float price=0;
    int quantity=0;

    cout << "Enter price: ";
    getline (cin,mystr);
    stringstream(mystr) >> price;
    cout << "Enter quantity: ";
    getline (cin,mystr);
    stringstream(mystr) >> quantity;
    cout << "Total price: " << price*quantity << endl;*/

    return 0;
}