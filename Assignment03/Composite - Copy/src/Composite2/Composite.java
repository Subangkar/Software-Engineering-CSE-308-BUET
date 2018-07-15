package Composite2;

import java.util.ArrayList;
import java.util.List;

class Composite implements iComposite
{
private String teacherName;
private String deptName;
private List< iComposite > controls;
Composite( String teacherName, String deptName)
{
this.teacherName = teacherName;
this.deptName = deptName;
controls = new ArrayList< iComposite >();
}
public void Add( Composite composite )
{
controls.add( composite );
}
public void Remove( Composite composite )
{
controls.remove( composite );
}
public List< iComposite > getControllingDepts()
{
return controls;
}
@Override
public String getDetails() {
return (teacherName + " is the " + deptName);
}
}
