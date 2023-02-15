#include<stdio.h>
#include<stdlib.h>
struct node
{
    int data;
    struct node *next;
};

struct node *head;
void instrtbig()
{
    printf("Enter the item ");
    int item;
    scanf("%d",&item);
    struct node *ptr= (struct node*)malloc(sizeof(struct node));
    if(ptr==NULL)
    {
        printf("overflow\n");

    }
    else{
        ptr->data=item;
        ptr->next=head;
        head=ptr;
        printf("node inserted successfully\n");
    }
}

int main()
{
    while(1)
    {
        instrtbig();
    }
    return 0;
}

