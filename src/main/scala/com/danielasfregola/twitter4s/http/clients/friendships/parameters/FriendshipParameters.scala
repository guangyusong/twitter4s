package com.danielasfregola.twitter4s.http.clients.friendships.parameters

import com.danielasfregola.twitter4s.http.marshalling.Parameters

case class FriendshipParameters(cursor: Long, stringify_ids: Boolean) extends Parameters
