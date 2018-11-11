package cn.bjhdltcdn.p2plive.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import cn.bjhdltcdn.p2plive.model.PushdbModel;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "PUSHDB_MODEL".
*/
public class PushdbModelDao extends AbstractDao<PushdbModel, Long> {

    public static final String TABLENAME = "PUSHDB_MODEL";

    /**
     * Properties of entity PushdbModel.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property MessageId = new Property(0, Long.class, "messageId", true, "_id");
        public final static Property Source = new Property(1, String.class, "source", false, "SOURCE");
        public final static Property ObjectName = new Property(2, String.class, "objectName", false, "OBJECT_NAME");
        public final static Property MessageType = new Property(3, long.class, "messageType", false, "MESSAGE_TYPE");
        public final static Property UnRead = new Property(4, int.class, "unRead", false, "UN_READ");
    }


    public PushdbModelDao(DaoConfig config) {
        super(config);
    }
    
    public PushdbModelDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"PUSHDB_MODEL\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: messageId
                "\"SOURCE\" TEXT," + // 1: source
                "\"OBJECT_NAME\" TEXT," + // 2: objectName
                "\"MESSAGE_TYPE\" INTEGER NOT NULL ," + // 3: messageType
                "\"UN_READ\" INTEGER NOT NULL );"); // 4: unRead
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"PUSHDB_MODEL\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, PushdbModel entity) {
        stmt.clearBindings();
 
        Long messageId = entity.getMessageId();
        if (messageId != null) {
            stmt.bindLong(1, messageId);
        }
 
        String source = entity.getSource();
        if (source != null) {
            stmt.bindString(2, source);
        }
 
        String objectName = entity.getObjectName();
        if (objectName != null) {
            stmt.bindString(3, objectName);
        }
        stmt.bindLong(4, entity.getMessageType());
        stmt.bindLong(5, entity.getUnRead());
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, PushdbModel entity) {
        stmt.clearBindings();
 
        Long messageId = entity.getMessageId();
        if (messageId != null) {
            stmt.bindLong(1, messageId);
        }
 
        String source = entity.getSource();
        if (source != null) {
            stmt.bindString(2, source);
        }
 
        String objectName = entity.getObjectName();
        if (objectName != null) {
            stmt.bindString(3, objectName);
        }
        stmt.bindLong(4, entity.getMessageType());
        stmt.bindLong(5, entity.getUnRead());
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public PushdbModel readEntity(Cursor cursor, int offset) {
        PushdbModel entity = new PushdbModel( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // messageId
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // source
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // objectName
            cursor.getLong(offset + 3), // messageType
            cursor.getInt(offset + 4) // unRead
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, PushdbModel entity, int offset) {
        entity.setMessageId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setSource(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setObjectName(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setMessageType(cursor.getLong(offset + 3));
        entity.setUnRead(cursor.getInt(offset + 4));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(PushdbModel entity, long rowId) {
        entity.setMessageId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(PushdbModel entity) {
        if(entity != null) {
            return entity.getMessageId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(PushdbModel entity) {
        return entity.getMessageId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}