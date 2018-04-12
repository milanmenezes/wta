#!/usr/bin/perl -w
use strict;
my @data=("Java", 12345, 1.45, 'abc');
my($i,$j);

for($i=0;$i<=$#data;$i++)
{
	print "$data[$i]\n";
}

print "\n\n";

foreach $j(@data)
{
	print "$j\n";
}
