#include <stdio.h>
#include "pgdbglog.h"
#include <stdarg.h>						// for å få med va_stuff
#include <time.h>


void PgDbgLogger(unsigned long ulErrorType, int iLine, const char *pszFile, const char *pszFormat, ...){
	static FILE *fp = NULL, *sp;					
	static int iCallCounter = 1;		
	
	extern char glob_var;
	
	char buffer[100];
	
	char szFileName[256] = {0};
	time_t tTimeAndDate = 0;
	
	if(fp == NULL){
		tTimeAndDate = time(NULL) - 1601399931;
		snprintf(szFileName, 256 - 1,"debug_%li.txt", tTimeAndDate); 
		fp = fopen(szFileName,"a"); 			
	
		sp = fopen("settings.txt", "r");
		fscanf(sp, "%[^\n\n]", buffer);
		glob_var = buffer[0];
		fclose(sp);
	}
	
	va_list vaArgumentPointer;
	char szOutputString[256] = {0};
	char *pszType = (ulErrorType==1)?"Error":"Debug";
	
	
	va_start(vaArgumentPointer, pszFormat);		
	
	vsnprintf(szOutputString, 256 - 1, pszFormat, vaArgumentPointer);
	va_end(vaArgumentPointer);
	
	fprintf(fp, " %04i: error type is %li: %s %s\n", iCallCounter, ulErrorType, pszType, 			szOutputString);
	
	iCallCounter++;
	
	return;
}
