#!/usr/bin/perl
use strict;
use CGI ':standard';

print
        header(),
        start_html(-title => 'Form Widget',-bgcolor => '#ffffff',-text => '#577777'),
	h1('A Form Widget'),
	start_form(),
        "Programming Language:",
	textfield(-name => 'lang' ,-value => 'perl'),
	br(),
	"Comments :",
	textarea(-name => 'cmt' ,-cols =>20 ,-rows =>5),
	br(),
	"Rate the coolness:",
	radio_group(-name => 'cool' ,values => ['Cool','VeryCool','IceCold'], -default => 'Cool'),
	br(),
	"I will learn CGI and perl:",
	checkbox(-name => 'pl', -value => 'Yes', -label => 'Yes' , -checked => 1),
	br(),
	"Operating System:",
	popup_menu(-name => 'os' , -values => ['Linux','Windows','Unix'], -size => 1),
	br(),
	"My favourite animals:",
	scrolling_list(-name => 'ani', -values => ['Penguin','Camel','Lion','Tiger'], -size => 3, -multiple => 1),
	br(),
	submit(-value => 'submit'),
	" ",
	reset(-value => 'reset'),
	end_form();
        end_html();

