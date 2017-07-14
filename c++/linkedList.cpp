
#include <iostream>
#include <fstream>
#include <string>
using namespace std;

class Node{
private:
    Node* next;
    int data;
public:
    Node(int d){ //constructor
        data=d;
        next=NULL;
    }//Node constructor
    Node(int d, Node* n){ //constructor
        data=d;
        next=n;
    } //Node constructor
    ~Node(){ //destructor, calls when instance of class is destroyed
        delete (next);
    } //~Node
    friend class LinkedListStack; //allows inheritance
};

class LinkedListStack{
private:
    Node* Top;
    int count=0;
    
public:
    LinkedListStack(){
        Top = NULL;
    }
    
    void push(int d){
        Node* newTop;
        if(isEmpty()){
            newTop= new Node(d,NULL);
            Top = newTop;
            cout << "next node address" << Top->next << endl;
            cout << "next node data " << "NULL" << endl;
            count++;
        }//if
        else{
            newTop= new Node(d,Top);
            Top = newTop;
            cout << "next node address" << Top->next << endl;
            cout << "next node data" << Top->next->data << endl;
            count++;
        }//else
    }//push function
    
    int pop(){
        if(isEmpty()){
            cout<<"The Stack is empty"<<endl;
            return 0;
        }//if
        
        Node* temp=Top;
        Top=Top->next;
        count--;
        cout << "pop " << temp->data << endl;
        free(temp);
        return temp->data;
    }//pop function
    
    bool isEmpty(){
        if(count==0){
            return true;
        } //if
        return false;
    }//isEmpty function
};

int main(int argc, const char * argv[]) {
    
    LinkedListStack LLS;
    ifstream inFile(argv[1]);
    inFile.open("Stack_LinkList_Data.txt");
    int data;
    int count = 0;
    while(inFile >> data){
        cout << data << endl;
        count++;
    } //while
    inFile.close();
    inFile.open("Stack_LinkList_Data.txt");
    while (inFile >> data){
        cout << "pushing " << data << endl;
        LLS.push(data);
    }//while
    while (!LLS.isEmpty()){
        LLS.pop();
    }//while
    
    inFile.close();
    return 0;
}
