// ORM class for table 'price_list'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 29 20:48:15 PST 2017
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

public class price_list extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private String dept;
  public String get_dept() {
    return dept;
  }
  public void set_dept(String dept) {
    this.dept = dept;
  }
  public price_list with_dept(String dept) {
    this.dept = dept;
    return this;
  }
  private String _class;
  public String get__class() {
    return _class;
  }
  public void set__class(String _class) {
    this._class = _class;
  }
  public price_list with__class(String _class) {
    this._class = _class;
    return this;
  }
  private String vendor;
  public String get_vendor() {
    return vendor;
  }
  public void set_vendor(String vendor) {
    this.vendor = vendor;
  }
  public price_list with_vendor(String vendor) {
    this.vendor = vendor;
    return this;
  }
  private String style;
  public String get_style() {
    return style;
  }
  public void set_style(String style) {
    this.style = style;
  }
  public price_list with_style(String style) {
    this.style = style;
    return this;
  }
  private Float reg_unit_price;
  public Float get_reg_unit_price() {
    return reg_unit_price;
  }
  public void set_reg_unit_price(Float reg_unit_price) {
    this.reg_unit_price = reg_unit_price;
  }
  public price_list with_reg_unit_price(Float reg_unit_price) {
    this.reg_unit_price = reg_unit_price;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof price_list)) {
      return false;
    }
    price_list that = (price_list) o;
    boolean equal = true;
    equal = equal && (this.dept == null ? that.dept == null : this.dept.equals(that.dept));
    equal = equal && (this._class == null ? that._class == null : this._class.equals(that._class));
    equal = equal && (this.vendor == null ? that.vendor == null : this.vendor.equals(that.vendor));
    equal = equal && (this.style == null ? that.style == null : this.style.equals(that.style));
    equal = equal && (this.reg_unit_price == null ? that.reg_unit_price == null : this.reg_unit_price.equals(that.reg_unit_price));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof price_list)) {
      return false;
    }
    price_list that = (price_list) o;
    boolean equal = true;
    equal = equal && (this.dept == null ? that.dept == null : this.dept.equals(that.dept));
    equal = equal && (this._class == null ? that._class == null : this._class.equals(that._class));
    equal = equal && (this.vendor == null ? that.vendor == null : this.vendor.equals(that.vendor));
    equal = equal && (this.style == null ? that.style == null : this.style.equals(that.style));
    equal = equal && (this.reg_unit_price == null ? that.reg_unit_price == null : this.reg_unit_price.equals(that.reg_unit_price));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.dept = JdbcWritableBridge.readString(1, __dbResults);
    this._class = JdbcWritableBridge.readString(2, __dbResults);
    this.vendor = JdbcWritableBridge.readString(3, __dbResults);
    this.style = JdbcWritableBridge.readString(4, __dbResults);
    this.reg_unit_price = JdbcWritableBridge.readFloat(5, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.dept = JdbcWritableBridge.readString(1, __dbResults);
    this._class = JdbcWritableBridge.readString(2, __dbResults);
    this.vendor = JdbcWritableBridge.readString(3, __dbResults);
    this.style = JdbcWritableBridge.readString(4, __dbResults);
    this.reg_unit_price = JdbcWritableBridge.readFloat(5, __dbResults);
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
    JdbcWritableBridge.writeString(dept, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_class, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(vendor, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(style, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeFloat(reg_unit_price, 5 + __off, 7, __dbStmt);
    return 5;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(dept, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_class, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(vendor, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(style, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeFloat(reg_unit_price, 5 + __off, 7, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.dept = null;
    } else {
    this.dept = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this._class = null;
    } else {
    this._class = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.vendor = null;
    } else {
    this.vendor = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.style = null;
    } else {
    this.style = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.reg_unit_price = null;
    } else {
    this.reg_unit_price = Float.valueOf(__dataIn.readFloat());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.dept) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, dept);
    }
    if (null == this._class) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _class);
    }
    if (null == this.vendor) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, vendor);
    }
    if (null == this.style) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, style);
    }
    if (null == this.reg_unit_price) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.reg_unit_price);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.dept) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, dept);
    }
    if (null == this._class) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _class);
    }
    if (null == this.vendor) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, vendor);
    }
    if (null == this.style) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, style);
    }
    if (null == this.reg_unit_price) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.reg_unit_price);
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
    __sb.append(FieldFormatter.escapeAndEnclose(dept==null?"null":dept, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_class==null?"null":_class, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(vendor==null?"null":vendor, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(style==null?"null":style, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(reg_unit_price==null?"null":"" + reg_unit_price, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(dept==null?"null":dept, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_class==null?"null":_class, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(vendor==null?"null":vendor, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(style==null?"null":style, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(reg_unit_price==null?"null":"" + reg_unit_price, delimiters));
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
    if (__cur_str.equals("null")) { this.dept = null; } else {
      this.dept = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._class = null; } else {
      this._class = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.vendor = null; } else {
      this.vendor = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.style = null; } else {
      this.style = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.reg_unit_price = null; } else {
      this.reg_unit_price = Float.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.dept = null; } else {
      this.dept = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._class = null; } else {
      this._class = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.vendor = null; } else {
      this.vendor = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.style = null; } else {
      this.style = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.reg_unit_price = null; } else {
      this.reg_unit_price = Float.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    price_list o = (price_list) super.clone();
    return o;
  }

  public void clone0(price_list o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("dept", this.dept);
    __sqoop$field_map.put("class", this._class);
    __sqoop$field_map.put("vendor", this.vendor);
    __sqoop$field_map.put("style", this.style);
    __sqoop$field_map.put("reg_unit_price", this.reg_unit_price);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("dept", this.dept);
    __sqoop$field_map.put("class", this._class);
    __sqoop$field_map.put("vendor", this.vendor);
    __sqoop$field_map.put("style", this.style);
    __sqoop$field_map.put("reg_unit_price", this.reg_unit_price);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("dept".equals(__fieldName)) {
      this.dept = (String) __fieldVal;
    }
    else    if ("class".equals(__fieldName)) {
      this._class = (String) __fieldVal;
    }
    else    if ("vendor".equals(__fieldName)) {
      this.vendor = (String) __fieldVal;
    }
    else    if ("style".equals(__fieldName)) {
      this.style = (String) __fieldVal;
    }
    else    if ("reg_unit_price".equals(__fieldName)) {
      this.reg_unit_price = (Float) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
  public boolean setField0(String __fieldName, Object __fieldVal) {
    if ("dept".equals(__fieldName)) {
      this.dept = (String) __fieldVal;
      return true;
    }
    else    if ("class".equals(__fieldName)) {
      this._class = (String) __fieldVal;
      return true;
    }
    else    if ("vendor".equals(__fieldName)) {
      this.vendor = (String) __fieldVal;
      return true;
    }
    else    if ("style".equals(__fieldName)) {
      this.style = (String) __fieldVal;
      return true;
    }
    else    if ("reg_unit_price".equals(__fieldName)) {
      this.reg_unit_price = (Float) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}
