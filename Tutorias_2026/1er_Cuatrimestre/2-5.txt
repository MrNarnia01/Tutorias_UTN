/*
Guia de ejercicios dde estructuras iterativas
Ejercicio 2
Fecha: 2/5/2026
*/

#include <iostream>
using namespace std;

int main(){
    
    int i,op;
    i=op=0;
    
    float dat,sum,n,may,men;
    dat=sum=n=0;
    may=men=-1;
    
    do{
        cout<<"\nIngrese la cant del grupo: ";
        cin>>n;
        if(n<=0)    cout<<"\nNumero invalido\n";
    }while(n<=0);
    
    for (i = 0; i < n; i++) {
        cout<<"\nIngrese la altura de la persona: "<<i+1<<" : ";
        cin>>dat;
        
        if(dat>0 && dat<=2){
            sum+=dat;
            //Mayor
            if(may==-1){
                may=dat;
            }else{
                if(may<dat){
                    may=dat;
                }
            }
            
            //Menor
            if(men==-1){
                men=dat;
            }else{
                if(men>dat){
                    men=dat;
                }
            }
        }else{
            i--;
        }
    }
    
    do{
        cout<<"\n\t\tMenu de opciones";
        cout<<"\n1-Promedio de alturas";
        cout<<"\n2-Mayor altura";
        cout<<"\n3-Menor altura";
        cout<<"\n4-Salir\n";
        cin>>op;
        
        switch(op){
            case 1:
                cout<<"\nEl promedio de altura es: "<<sum/n;
            break;
            case 2:
                cout<<"\nLa mayor altura es: "<<may;
            break;
            case 3:
                cout<<"\nLa menor altura es: "<<men;
            break;
            case 4:
            break;
            default:
                cout<<"\nOpcion invalida\n";
        }
        
        
    }while(op!=4);
    
}
