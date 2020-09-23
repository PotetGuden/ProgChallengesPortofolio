#include <stdio.h>
#include "pgdbglog.h"
#include <stdarg.h>						// for å få med va_stuff
#include <time.h>


void PgDbgLogger(unsigned long ulErrorType, int iLine, const char *pszFile, const char *pszFormat, ...){
	static FILE *fp;					// file pointer
	static int iCallCounter = 1;		// static counter
	
	char szFileName[256] = {0};
	time_t tTimeAndDate = 0;
	if(fp == NULL){
		tTimeAndDate = time(NULL)/10000000;		// time(NULL) er n sekunder etter 1970.
		snprintf(szFileName, 256 - 1,"debug_%li.txt", tTimeAndDate); // Gir szFileName en verdi
	}
	fp = fopen(szFileName,"a"); 		// Åpner debug.txt og gir tilgang til å "a" appende
	
	//fprintf(fp," dette er en test");	// <- input til output fil
	
	va_list vaArgumentPointer;
	char szOutputString[256] = {0};
	char *pszType = (ulErrorType==1)?"Error":"Debug";
	
	
	va_start(vaArgumentPointer, pszFormat);		// Aner ikke hva dette gjør..
	//vfprintf(fp, pszFormat, vaArgumentPointer);
	vsnprintf(szOutputString, 256 - 1, pszFormat, vaArgumentPointer);
	va_end(vaArgumentPointer);
	
	fprintf(fp, " %04i: error type is %li: %s %s\n", iCallCounter, ulErrorType, pszType, 			szOutputString);
	
	iCallCounter++;
	
	fclose(fp);							// alltid husk å close :)
	return;
}
