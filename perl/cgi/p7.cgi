#!/usr/bin/perl -w
use strict;
use CGI ':standard';
my $name=param('yname')||"Milan";
my $age=param('age')||19;
print
header(),
start_html(-title=>'form-handle'),
p("Name is $name and age is $age"),
end_html();
