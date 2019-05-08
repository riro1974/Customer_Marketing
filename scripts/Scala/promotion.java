// ORM class for table 'promotion'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 29 20:46:02 PST 2017
// For connector: org.apache.sqoop.manager.DirectMySQLManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class promotion extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private String promo_id;
  public String get_promo_id() {
    return promo_id;
  }
  public void set_promo_id(String promo_id) {
    this.promo_id = promo_id;
  }
  public promotion with_promo_id(String promo_id) {
    this.promo_id = promo_id;
    return this;
  }
  private String promo_desc;
  public String get_promo_desc() {
    return promo_desc;
  }
  public void set_promo_desc(String promo_desc) {
    this.promo_desc = promo_desc;
  }
  public promotion with_promo_desc(String promo_desc) {
    this.promo_desc = promo_desc;
    return this;
  }
  private String dept;
  public String get_dept() {
    return dept;
  }
  public void set_dept(String dept) {
    this.dept = dept;
  }
  public promotion with_dept(String dept) {
    this.dept = dept;
    return this;
  }
  private java.sql.Date start_dt;
  public java.sql.Date get_start_dt() {
    return start_dt;
  }
  public void set_start_dt(java.sql.Date start_dt) {
    this.start_dt = start_dt;
  }
  public promotion with_start_dt(java.sql.Date start_dt) {
    this.start_dt = start_dt;
    return this;
  }
  private java.sql.Date end_dt;
  public java.sql.Date get_end_dt() {
    return end_dt;
  }
  public void set_end_dt(java.sql.Date end_dt) {
    this.end_dt = end_dt;
  }
  public promotion with_end_dt(java.sql.Date end_dt) {
    this.end_dt = end_dt;
    return this;
  }
  private Float promo_pct;
  public Float get_promo_pct() {
    return promo_pct;
  }
  public void set_promo_pct(Float promo_pct) {
    this.promo_pct = promo_pct;
  }
  public promotion with_promo_pct(Float promo_pct) {
    this.promo_pct = promo_pct;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof promotion)) {
      return false;
    }
    promotion that = (promotion) o;
    boolean equal = true;
    equal = equal && (this.promo_id == null ? that.promo_id == null : this.promo_id.equals(that.promo_id));
    equal = equal && (this.promo_desc == null ? that.promo_desc == null : this.promo_desc.equals(that.promo_desc));
    equal = equal && (this.dept == null ? that.dept == null : this.dept.equals(that.dept));
    equal = equal && (this.start_dt == null ? that.start_dt == null : this.start_dt.equals(that.start_dt));
    equal = equal && (this.end_dt == null ? that.end_dt == null : this.end_dt.equals(that.end_dt));
    equal = equal && (this.promo_pct == null ? that.promo_pct == null : this.promo_pct.equals(that.promo_pct));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof promotion)) {
      return false;
    }
    promotion that = (promotion) o;
    boolean equal = true;
    equal = equal && (this.promo_id == null ? that.promo_id == null : this.promo_id.equals(that.promo_id));
    equal = equal && (this.promo_desc == null ? that.promo_desc == null : this.promo_desc.equals(that.promo_desc));
    equal = equal && (this.dept == null ? that.dept == null : this.dept.equals(that.dept));
    equal = equal && (this.start_dt == null ? that.start_dt == null : this.start_dt.equals(that.start_dt));
    equal = equal && (this.end_dt == null ? that.end_dt == null : this.end_dt.equals(that.end_dt));
    equal = equal && (this.promo_pct == null ? that.promo_pct == null : this.promo_pct.equals(that.promo_pct));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.promo_id = JdbcWritableBridge.readString(1, __dbResults);
    this.promo_desc = JdbcWritableBridge.readString(2, __dbResults);
    this.dept = JdbcWritableBridge.readString(3, __dbResults);
    this.start_dt = JdbcWritableBridge.readDate(4, __dbResults);
    this.end_dt = JdbcWritableBridge.readDate(5, __dbResults);
    this.promo_pct = JdbcWritableBridge.readFloat(6, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.promo_id = JdbcWritableBridge.readString(1, __dbResults);
    this.promo_desc = JdbcWritableBridge.readString(2, __dbResults);
    this.dept = JdbcWritableBridge.readString(3, __dbResults);
    this.start_dt = JdbcWritableBridge.readDate(4, __dbResults);
    this.end_dt = JdbcWritableBridge.readDate(5, __dbResults);
    this.promo_pct = JdbcWritableBridge.readFloat(6, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(promo_id, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(promo_desc, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(dept, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDate(start_dt, 4 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeDate(end_dt, 5 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeFloat(promo_pct, 6 + __off, 7, __dbStmt);
    return 6;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(promo_id, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(promo_desc, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(dept, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDate(start_dt, 4 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeDate(end_dt, 5 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeFloat(promo_pct, 6 + __off, 7, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.promo_id = null;
    } else {
    this.promo_id = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.promo_desc = null;
    } else {
    this.promo_desc = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.dept = null;
    } else {
    this.dept = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.start_dt = null;
    } else {
    this.start_dt = new Date(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.end_dt = null;
    } else {
    this.end_dt = new Date(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.promo_pct = null;
    } else {
    this.promo_pct = Float.valueOf(__dataIn.readFloat());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.promo_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, promo_id);
    }
    if (null == this.promo_desc) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, promo_desc);
    }
    if (null == this.dept) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, dept);
    }
    if (null == this.start_dt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.start_dt.getTime());
    }
    if (null == this.end_dt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.end_dt.getTime());
    }
    if (null == this.promo_pct) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.promo_pct);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.promo_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, promo_id);
    }
    if (null == this.promo_desc) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, promo_desc);
    }
    if (null == this.dept) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, dept);
    }
    if (null == this.start_dt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.start_dt.getTime());
    }
    if (null == this.end_dt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.end_dt.getTime());
    }
    if (null == this.promo_pct) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.promo_pct);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(promo_id==null?"null":promo_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(promo_desc==null?"null":promo_desc, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(dept==null?"null":dept, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(start_dt==null?"null":"" + start_dt, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(end_dt==null?"null":"" + end_dt, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(promo_pct==null?"null":"" + promo_pct, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(promo_id==null?"null":promo_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(promo_desc==null?"null":promo_desc, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(dept==null?"null":dept, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(start_dt==null?"null":"" + start_dt, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(end_dt==null?"null":"" + end_dt, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(promo_pct==null?"null":"" + promo_pct, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.promo_id = null; } else {
      this.promo_id = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.promo_desc = null; } else {
      this.promo_desc = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.dept = null; } else {
      this.dept = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.start_dt = null; } else {
      this.start_dt = java.sql.Date.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.end_dt = null; } else {
      this.end_dt = java.sql.Date.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.promo_pct = null; } else {
      this.promo_pct = Float.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.promo_id = null; } else {
      this.promo_id = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.promo_desc = null; } else {
      this.promo_desc = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.dept = null; } else {
      this.dept = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.start_dt = null; } else {
      this.start_dt = java.sql.Date.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.end_dt = null; } else {
      this.end_dt = java.sql.Date.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.promo_pct = null; } else {
      this.promo_pct = Float.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    promotion o = (promotion) super.clone();
    o.start_dt = (o.start_dt != null) ? (java.sql.Date) o.start_dt.clone() : null;
    o.end_dt = (o.end_dt != null) ? (java.sql.Date) o.end_dt.clone() : null;
    return o;
  }

  public void clone0(promotion o) throws CloneNotSupportedException {
    o.start_dt = (o.start_dt != null) ? (java.sql.Date) o.start_dt.clone() : null;
    o.end_dt = (o.end_dt != null) ? (java.sql.Date) o.end_dt.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("promo_id", this.promo_id);
    __sqoop$field_map.put("promo_desc", this.promo_desc);
    __sqoop$field_map.put("dept", this.dept);
    __sqoop$field_map.put("start_dt", this.start_dt);
    __sqoop$field_map.put("end_dt", this.end_dt);
    __sqoop$field_map.put("promo_pct", this.promo_pct);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("promo_id", this.promo_id);
    __sqoop$field_map.put("promo_desc", this.promo_desc);
    __sqoop$field_map.put("dept", this.dept);
    __sqoop$field_map.put("start_dt", this.start_dt);
    __sqoop$field_map.put("end_dt", this.end_dt);
    __sqoop$field_map.put("promo_pct", this.promo_pct);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("promo_id".equals(__fieldName)) {
      this.promo_id = (String) __fieldVal;
    }
    else    if ("promo_desc".equals(__fieldName)) {
      this.promo_desc = (String) __fieldVal;
    }
    else    if ("dept".equals(__fieldName)) {
      this.dept = (String) __fieldVal;
    }
    else    if ("start_dt".equals(__fieldName)) {
      this.start_dt = (java.sql.Date) __fieldVal;
    }
    else    if ("end_dt".equals(__fieldName)) {
      this.end_dt = (java.sql.Date) __fieldVal;
    }
    else    if ("promo_pct".equals(__fieldName)) {
      this.promo_pct = (Float) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
  public boolean setField0(String __fieldName, Object __fieldVal) {
    if ("promo_id".equals(__fieldName)) {
      this.promo_id = (String) __fieldVal;
      return true;
    }
    else    if ("promo_desc".equals(__fieldName)) {
      this.promo_desc = (String) __fieldVal;
      return true;
    }
    else    if ("dept".equals(__fieldName)) {
      this.dept = (String) __fieldVal;
      return true;
    }
    else    if ("start_dt".equals(__fieldName)) {
      this.start_dt = (java.sql.Date) __fieldVal;
      return true;
    }
    else    if ("end_dt".equals(__fieldName)) {
      this.end_dt = (java.sql.Date) __fieldVal;
      return true;
    }
    else    if ("promo_pct".equals(__fieldName)) {
      this.promo_pct = (Float) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}
