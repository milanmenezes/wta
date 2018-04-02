#!/usr/bin/perl -w

use strict;

sub f1 {
my $x=10;
my $y=20;
$x+$y;
}

sub f2 {
my @a = ('Java', 10, 433.5);
for(my $i=0; $i<=$#a;$i++){
	print "$a[$i]\n";
}
}
my $b=f1();
print "$b\n";
f2();