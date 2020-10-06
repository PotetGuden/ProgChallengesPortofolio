#ifndef PGDBGLOG_H_
#define PGDBGLOG_H_
#define pgdebug(...) if(glob_var == 1) {PgDbgLogger(0, __LINE__, __FILE__, __VA_ARGS__); }
#define pgerror(...) PgDbgLogger(1, __LINE__, __FILE__, __VA_ARGS__)

void PgDbgLogger(unsigned long ulErrorType, int iLine, const char *pszFile, const char *pszFormat, ...);

#endif // PGDBGLOG_H
