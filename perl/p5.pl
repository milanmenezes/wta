#!/usr/bin/perl -w
use strict;
my %data=(
	name => "abc",
	age=> 20 
	);

print "$data{name} is $data{age} years o;d\n";

my @k = keys(%data);
print "@k\n";

my @s = sort(@k);
print "@s\n";
