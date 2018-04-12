#!/usr/bin/perl -w

use strict;

sub f1 {
my($x,$y,$z)=@_;
print "$x\n";
print "$y\n";
print "$z\n";
}

my $a=10;
my $b= "abc";
f1($a,$b,12345);