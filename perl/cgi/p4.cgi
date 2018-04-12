#!/usr/bin/perl
use strict;
use CGI ':standard';

my $host = server_name();
my $date = localtime();
print
        header(),
        start_html(-title => 'A hello world page',-bgcolor => '#ffffff',-text => '#577777'),
        h1("Hello from $host!!"),
        "The current time is : $date",
        end_html();
