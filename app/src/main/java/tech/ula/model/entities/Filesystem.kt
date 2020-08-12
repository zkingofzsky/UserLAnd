package tech.ula.model.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
@Entity(tableName = "filesystem")
data class Filesystem(
    @PrimaryKey(autoGenerate = true)
    val id: Long,
    var name: String = "",
    var distributionType: String = "",
    var archType: String = "",
    var defaultUsername: String = "",
    var defaultPassword: String = "",
    var defaultVncPassword: String = "",
    var isAppsFilesystem: Boolean = false,
    var versionCodeUsed: String = "v0.0.0",
    var isCreatedFromBackup: Boolean = false
) : Parcelable {
    override fun toString(): String {
        return "Filesystem(id=$id, name=$name, distributionType=$distributionType, archType=" +
                "$archType, isAppsFilesystem=$isAppsFilesystem, versionCodeUsed=$versionCodeUsed, " +
                "isCreatedFromBackup=$isCreatedFromBackup"
    }
}