#!/usr/bin/perl -w
use strict;
my($a, $b, $c);
chomp($a = <STDIN>);
chomp($b = <STDIN>);

$c = $a*$b;
print "$c\n";