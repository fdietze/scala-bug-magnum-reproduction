package backend.db

import com.augustnagro.magnum.*
import com.augustnagro.magnum.Spec as MSpec


@Table(SqliteDbType)
@SqlName("effect_event")
case class EffectEvent() derives DbCodec

object EffectEvent {
  case class Creator()
}

