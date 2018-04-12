#!/usr/bin/perl
use CGI ':standard';

print
	header(),
        start_html(-title => 'A hello world page',-bgcolor => '#ffffff',-text => '#577777'),
        h1('Welcome to CGI'),
        hr(),
        "Thank You!!",
        end_html(); 
