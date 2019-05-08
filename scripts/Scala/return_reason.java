// ORM class for table 'return_reason'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 29 20:47:21 PST 2017
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

public class return_reason extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private String return_reason_cd;
  public String get_return_reason_cd() {
    return return_reason_cd;
  }
  public void set_return_reason_cd(String return_reason_cd) {
    this.return_reason_cd = return_reason_cd;
  }
  public return_reason with_return_reason_cd(String return_reason_cd) {
    this.return_reason_cd = return_reason_cd;
    return this;
  }
  private String return_reason_cd_desc;
  public String get_return_reason_cd_desc() {
    return return_reason_cd_desc;
  }
  public void set_return_reason_cd_desc(String return_reason_cd_desc) {
    this.return_reason_cd_desc = return_reason_cd_desc;
  }
  public return_reason with_return_reason_cd_desc(String return_reason_cd_desc) {
    this.return_reason_cd_desc = return_reason_cd_desc;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof return_reason)) {
      return false;
    }
    return_reason that = (return_reason) o;
    boolean equal = true;
    equal = equal && (this.return_reason_cd == null ? that.return_reason_cd == null : this.return_reason_cd.equals(that.return_reason_cd));
    equal = equal && (this.return_reason_cd_desc == null ? that.return_reason_cd_desc == null : this.return_reason_cd_desc.equals(that.return_reason_cd_desc));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof return_reason)) {
      return false;
    }
    return_reason that = (return_reason) o;
    boolean equal = true;
    equal = equal && (this.return_reason_cd == null ? that.return_reason_cd == null : this.return_reason_cd.equals(that.return_reason_cd));
    equal = equal && (this.return_reason_cd_desc == null ? that.return_reason_cd_desc == null : this.return_reason_cd_desc.equals(that.return_reason_cd_desc));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.return_reason_cd = JdbcWritableBridge.readString(1, __dbResults);
    this.return_reason_cd_desc = JdbcWritableBridge.readString(2, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.return_reason_cd = JdbcWritableBridge.readString(1, __dbResults);
    this.return_reason_cd_desc = JdbcWritableBridge.readString(2, __dbResults);
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
    JdbcWritableBridge.writeString(return_reason_cd, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(return_reason_cd_desc, 2 + __off, 12, __dbStmt);
    return 2;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(return_reason_cd, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(return_reason_cd_desc, 2 + __off, 12, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.return_reason_cd = null;
    } else {
    this.return_reason_cd = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.return_reason_cd_desc = null;
    } else {
    this.return_reason_cd_desc = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.return_reason_cd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, return_reason_cd);
    }
    if (null == this.return_reason_cd_desc) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, return_reason_cd_desc);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.return_reason_cd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, return_reason_cd);
    }
    if (null == this.return_reason_cd_desc) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, return_reason_cd_desc);
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
    __sb.append(FieldFormatter.escapeAndEnclose(return_reason_cd==null?"null":return_reason_cd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(return_reason_cd_desc==null?"null":return_reason_cd_desc, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(return_reason_cd==null?"null":return_reason_cd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(return_reason_cd_desc==null?"null":return_reason_cd_desc, delimiters));
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
    if (__cur_str.equals("null")) { this.return_reason_cd = null; } else {
      this.return_reason_cd = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.return_reason_cd_desc = null; } else {
      this.return_reason_cd_desc = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.return_reason_cd = null; } else {
      this.return_reason_cd = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.return_reason_cd_desc = null; } else {
      this.return_reason_cd_desc = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    return_reason o = (return_reason) super.clone();
    return o;
  }

  public void clone0(return_reason o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("return_reason_cd", this.return_reason_cd);
    __sqoop$field_map.put("return_reason_cd_desc", this.return_reason_cd_desc);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("return_reason_cd", this.return_reason_cd);
    __sqoop$field_map.put("return_reason_cd_desc", this.return_reason_cd_desc);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("return_reason_cd".equals(__fieldName)) {
      this.return_reason_cd = (String) __fieldVal;
    }
    else    if ("return_reason_cd_desc".equals(__fieldName)) {
      this.return_reason_cd_desc = (String) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
  public boolean setField0(String __fieldName, Object __fieldVal) {
    if ("return_reason_cd".equals(__fieldName)) {
      this.return_reason_cd = (String) __fieldVal;
      return true;
    }
    else    if ("return_reason_cd_desc".equals(__fieldName)) {
      this.return_reason_cd_desc = (String) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}
