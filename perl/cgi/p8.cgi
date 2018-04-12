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

my $sth1 = $dbh->prepare('select * from student_milan') or die('can not prepare').$dbh->errstr();
$sth1->execute() or die('can not execute').$sth->errstr();
my($usn,$name,$branch,$marks);
print
start_html(-title=>'form-handle'),
'<table border="2px solid black"><tr><th>USN</th><th>Name</th><th>Branch</th><th>marks</th>';

while(($usn,$name,$branch,$marks)= $sth1->fetchrow())
{
	print "<tr><td> $usn </td><td> $name </td><td> $branch </td><td> $marks </td></tr>";
	# p("$usn  $name  $branch  $marks");
}
print
end_html();
$sth1	->finish();
$dbh->disconnect();