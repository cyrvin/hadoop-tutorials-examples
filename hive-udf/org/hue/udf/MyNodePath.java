
package org.hue.udf;

import java.util.List;
import java.util.ArrayList;
import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.hadoop.io.Text;

public final class MyNodePath extends UDF {
  public String[] evaluate(final String[] s) {
    if (s == null) { return null; }
    
    List<String> nodePath = new ArrayList<String>();
    
    for (int i = 0 ; i < s.length ; i++) {
     String path;
     for (int j = 0 ; j <= i ; j++) {
      if (j > 0) { path += " > "; }
      path += s[i];
     }
     nodePath.add(temp);
    }
    String[] pathArray = new String[nodePath.size()];
    where.toArray(pathArray);
    return pathArray;
  }
}

