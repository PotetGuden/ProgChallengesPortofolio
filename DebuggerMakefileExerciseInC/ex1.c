// ex1.c: Lession 4, exercise 1:
//
// cl /Od /Zi ex1.c
// gcc -O2 ex1.c -o ex1
//
// -or- make TARGET=ex1
//


#include <stdio.h>
#include "pgdbglog.h"

char glob_var = NULL;

int a, b;


int main (void){

	//PgDbgLogger(1,__LINE__, __FILE__, "%s", "C er gøy");     HARDKODET, bruker define fra 		header file
	pgdebug("test");    // Definer pgdebug i header filen
	pgerror("error testing");

   int i, j;
   printf("Addresssssess of globsals variables: %p %p\n", &a, &b);
   printf("Addressses of local vassriables: %p %p\n", &i, &j);
   
   //PgDbgLogger(2,__LINE__, __FILE__, "%s", "C er rart");
   for(int i = 0; i < 5; i++){
   		printf("%d\n", i);
   }
   
	//PgDbgLogger(3,__LINE__, __FILE__, "%s", "C er weird");
   
   return 0;
}
