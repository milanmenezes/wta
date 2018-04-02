#!/usr/bin/perl -w
use strict;
my @data=("Java", 12345, 1.45, 'abc');
my($i,$j,@b);

print "@data\n";
push (@data, 10);
print "@data\n";
pop(@data);
print "@data\n";

unshift(@data, 10);
print "@data\n";
shift(@data);
print "@data\n";

@b=sort(@data);
print "@b\n";

my @c = reverse(@data);
print "@c\n";