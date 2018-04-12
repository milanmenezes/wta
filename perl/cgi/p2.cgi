#! /usr/bin/perl -w
use strict;
my($host,$date);
chomp($host=`/bin/hostname`);
chomp($date=`/bin/date`);
print "Content-Type:text/html\n\n";

print<<EOS;
<html>
<head>
</head>
<body>
<h1>
hostname= $host
<br>
date= $date
</h1>
</body>
</html>
EOS
