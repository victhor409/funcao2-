#include<iostream>

using namespace std;


void circulo();
float raio,  v,  b;

int main(){

circulo();
cout<<"Informe o valor do Raio: ";
cin>>raio;

circulo();
cout<<"Informe o valor da base: ";
cin>>b;

circulo();
cout<<"O volume do raio da circunferencia e: "<<v;

}

void circulo(){
 v = 4/3*b*raio*3;

}

 