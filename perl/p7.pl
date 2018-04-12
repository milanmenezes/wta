#!/usr/bin/perl -w
use strict;
my($a, $b, $c, $d);
$a = "abc";
$b = "def";

$c = $a.$b;
$d = "$a" x 2;
print "$c\n";
print "$d\n";