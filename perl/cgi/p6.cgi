#!/usr/bin/perl -w
use strict;
use CGI ':standard';
my $path1 = path_info();
my $path2 = $ENV{PATH_INFO};
print
header(),
start_html(-title=>'Path info'),
p("Path info using method= $path1"),
p("Path info using variable = $path2"),
end_html();
