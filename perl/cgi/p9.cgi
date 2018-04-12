#!/usr/bin/perl -w
use strict;
use CGI ':standard';
use DBI;

my $dbh = DBI->connect('DBI:mysql:csb3','viics57','viics57') or die("cannot connect").DBI->err();
my $sth = $dbh->prepare('select * from student_milan') or die('can not prepare').$dbh->errstr();
$sth->execute() or die('can not execute').$sth->errstr();
my($usn,$name,$branch,$marks);
print
header(),
start_html(-title=>'form-handle'),
'<table border="2px solid black"><tr><th>USN</th><th>Name</th><th>Branch</th><th>marks</th>';

while(($usn,$name,$branch,$marks)= $sth->fetchrow())
{
	print "<tr><td> $usn </td><td> $name </td><td> $branch </td><td> $marks </td></tr>";
	# p("$usn  $name  $branch  $marks");
}
print
end_html();
$sth->finish();
$dbh->disconnect();