//This program is made by Steven Frausto on 1/27/2025
//Credit to Prof Joe for providing the example of memory structure.

#include "../../cLibrary/defaultHeader.h"
#include <unistd.h>
int data = 5;
int bss = 0;

int main () {
    
  int stack = 8;
  int* heapPtr = (int*)malloc(sizeof(int));

  *heapPtr = 21;
  
  pid_t childPid =fork();
  
  if (childPid == 0){
    data /= 4;
    bss /= 4;
    stack /= 4;
    *heapPtr /= 4;
  }

  else{
    data /= 2;
    bss /= 2;
    stack /= 2;
    *heapPtr /= 2;
  }


  printf("Hello from process %d: data = %d, bss = %d, stack = %d, heap = %d\n", data, bss, stack, *heapPtr);

  return(EXIT_SUCCESS);
}
