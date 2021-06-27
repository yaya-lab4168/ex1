{\rtf1\ansi\ansicpg1252\cocoartf2580
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fnil\fcharset0 Menlo-Regular;\f1\fnil\fcharset0 Menlo-BoldItalic;\f2\fnil\fcharset0 Menlo-Italic;
}
{\colortbl;\red255\green255\blue255;\red204\green108\blue29;\red217\green232\blue247;\red18\green144\blue195;
\red249\green250\blue244;\red30\green181\blue64;\red121\green171\blue255;\red230\green230\blue250;\red242\green242\blue0;
\red104\green151\blue187;\red141\green218\blue248;\red167\green236\blue33;\red23\green198\blue163;\red150\green236\blue63;
\red243\green236\blue121;}
{\*\expandedcolortbl;;\csgenericrgb\c80000\c42353\c11373;\csgenericrgb\c85098\c90980\c96863;\csgenericrgb\c7059\c56471\c76471;
\csgenericrgb\c97647\c98039\c95686;\csgenericrgb\c11765\c70980\c25098;\csgenericrgb\c47451\c67059\c100000;\csgenericrgb\c90196\c90196\c98039;\csgenericrgb\c94902\c94902\c0;
\csgenericrgb\c40784\c59216\c73333;\csgenericrgb\c55294\c85490\c97255;\csgenericrgb\c65490\c92549\c12941;\csgenericrgb\c9020\c77647\c63922;\csgenericrgb\c58824\c92549\c24706;
\csgenericrgb\c95294\c92549\c47451;}
\paperw11900\paperh16840\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\deftab720
\pard\pardeftab720\partightenfactor0

\f0\fs24 \cf2 public\cf3  \cf2 class\cf3  \cf4 Calculator\cf3  \cf5 \{\cf0 \
\pard\pardeftab720\partightenfactor0
\cf3 	\cf0 \
\cf3 	\cf2 static\cf3  \cf2 int\cf3  \cf6 somme\cf5 (\cf3  \cf2 int\cf3  \cf7 p1\cf8 ,\cf3  \cf2 int\cf3  \cf7 p2\cf5 )\{\cf0 \
\cf3 		\cf0 \
\cf3 		\cf2 return\cf3  \cf5 (\cf7 p1\cf3  \cf8 +\cf3  \cf7 p2\cf5 )\cf8 ;\cf0 \
\cf3 		\cf0 \
\cf3 	\cf5 \}\cf0 \
\cf3 	\cf0 \
\cf3 		\cf2 static\cf3  \cf2 int\cf3  \cf6 sub\cf5 (\cf3  \cf2 int\cf3  \cf7 p1\cf8 ,\cf3  \cf2 int\cf3  \cf7 p2\cf5 )\{\cf0 \
\cf3 			\cf2 return\cf3  \cf5 (\cf7 p1\cf3  \cf8 -\cf3  \cf7 p2\cf5 )\cf8 ;\cf0 \
\
\pard\pardeftab720\partightenfactor0
\cf5 \}\cf0 \
\pard\pardeftab720\partightenfactor0
\cf3 		\cf0 \
\cf3 		\cf2 static\cf3  \cf2 int\cf3  \cf6 div\cf5 (\cf3  \cf2 int\cf3  \cf7 p1\cf8 ,\cf3  \cf2 int\cf3  \cf7 p2\cf5 )\{\cf0 \
\cf3 			\cf2 return\cf3  \cf5 (\cf7 p1\cf3  \cf8 /\cf3  \cf7 p2\cf5 )\cf8 ;\cf0 \
\
\cf3 		\cf5 \}\cf0 \
\cf3 		\cf0 \
\cf3 	\cf2 public\cf3  \cf2 static\cf3  \cf2 void\cf3  \cf6 main\cf5 (\cf4 String\cf5 []\cf3  \cf7 args\cf5 )\cf3  \cf5 \{\cf0 \
\cf3 		\cf0 \
\cf3 		\cf2 int\cf3  \cf9 a\cf3  \cf8 =\cf3  \cf10 5\cf8 ;\cf0 \
\cf3 		\cf2 int\cf3  \cf9 b\cf3  \cf8 =\cf3  \cf10 6\cf8 ;\cf0 \
\cf3 		\cf0 \
\cf3 		\cf4 System\cf8 .
\f1\i\b \cf11 out
\f0\i0\b0 \cf8 .\cf12 println\cf5 (\cf13 "somme de a et b est : "\cf3  \cf8 +
\f2\i \cf14 somme
\f0\i0 \cf5 (\cf15 a\cf8 ,\cf15 b\cf5 ))\cf8 ;\cf0 \
\cf3 		\cf4 System\cf8 .
\f1\i\b \cf11 out
\f0\i0\b0 \cf8 .\cf12 println\cf5 (\cf13 "Soustraction de a et b de  est : "\cf3  \cf8 +
\f2\i \cf14 sub
\f0\i0 \cf5 (\cf15 a\cf8 ,\cf15 b\cf5 ))\cf8 ;\cf0 \
\cf3 		\cf4 System\cf8 .
\f1\i\b \cf11 out
\f0\i0\b0 \cf8 .\cf12 println\cf5 (\cf13 "division de a et b de  est : "\cf3  \cf8 +
\f2\i \cf14 div
\f0\i0 \cf5 (\cf15 a\cf8 ,\cf15 b\cf5 ))\cf8 ;\cf0 \
\cf3 		\cf0 \
\
\cf3   \cf5 \}\cf0 \
\
\pard\pardeftab720\partightenfactor0
\cf5 \}}