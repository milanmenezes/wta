#!/usr/bin/perl -w
use strict;
use CGI ':standard';
use DBI;

my $usn=param('usn')||"None";
my $name=param('name')||"None";
my $branch=param('branch')||"None";
my $marks=param('marks')||0;

print
header(),
start_html(-title=>'form-handle');

my $dbh = DBI->connect('DBI:mysql:csb3','viics57','viics57') or die("cannot connect").DBI->err();
my $sth = $dbh->prepare("insert into student_milan values('$usn','$name','$branch',$marks)") or die('can not prepare').$dbh->errstr();
$sth->execute() or die('can not execute').$sth->errstr();
$sth->finish();
$dbh->disconnect();
print
p("Data entry successful"),
end_html();