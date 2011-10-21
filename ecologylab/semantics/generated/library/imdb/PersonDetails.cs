//
// PersonDetails.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator on 10/21/11.
// Copyright 2011 Interface Ecology Lab. 
//


using Simpl.Fundamental.Generic;
using Simpl.Fundamental.Net;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;
using ecologylab.collections;
using ecologylab.semantics.generated.library.imdb;
using ecologylab.semantics.metadata;
using ecologylab.semantics.metadata.builtins;
using ecologylab.semantics.metadata.scalar;
using ecologylab.semantics.metametadata;

namespace ecologylab.semantics.generated.library.imdb 
{
	/// <summary>
	/// IMDB metadata
	/// </summary>
	[SimplInherit]
	public class PersonDetails : CompoundDocument
	{
		[SimplScalar]
		private MetadataString gist;

		[SimplScalar]
		private MetadataParsedURL personImg;

		[SimplComposite]
		[MmName("birth_detail")]
		private BirthDetail birthDetail;

		[SimplScalar]
		private MetadataString miniBiography;

		[SimplScalar]
		private MetadataParsedURL biographyLink;

		[SimplCollection("imdb_title")]
		[MmName("titles_as_actor")]
		private List<ImdbTitle> titlesAsActor;

		[SimplCollection("imdb_title")]
		[MmName("titles_as_actress")]
		private List<ImdbTitle> titlesAsActress;

		[SimplCollection("imdb_title")]
		[MmName("titles_as_director")]
		private List<ImdbTitle> titlesAsDirector;

		[SimplCollection("imdb_title")]
		[MmName("titles_for_soundtrack")]
		private List<ImdbTitle> titlesForSoundtrack;

		[SimplCollection("imdb_title")]
		[MmName("titles_as_producer")]
		private List<ImdbTitle> titlesAsProducer;

		[SimplCollection("imdb_title")]
		[MmName("titles_thanked_in")]
		private List<ImdbTitle> titlesThankedIn;

		[SimplCollection("imdb_title")]
		[MmName("titles_as_self")]
		private List<ImdbTitle> titlesAsSelf;

		public PersonDetails()
		{ }

		public MetadataString Gist
		{
			get{return gist;}
			set{gist = value;}
		}

		public MetadataParsedURL PersonImg
		{
			get{return personImg;}
			set{personImg = value;}
		}

		public BirthDetail BirthDetail
		{
			get{return birthDetail;}
			set{birthDetail = value;}
		}

		public MetadataString MiniBiography
		{
			get{return miniBiography;}
			set{miniBiography = value;}
		}

		public MetadataParsedURL BiographyLink
		{
			get{return biographyLink;}
			set{biographyLink = value;}
		}

		public List<ImdbTitle> TitlesAsActor
		{
			get{return titlesAsActor;}
			set{titlesAsActor = value;}
		}

		public List<ImdbTitle> TitlesAsActress
		{
			get{return titlesAsActress;}
			set{titlesAsActress = value;}
		}

		public List<ImdbTitle> TitlesAsDirector
		{
			get{return titlesAsDirector;}
			set{titlesAsDirector = value;}
		}

		public List<ImdbTitle> TitlesForSoundtrack
		{
			get{return titlesForSoundtrack;}
			set{titlesForSoundtrack = value;}
		}

		public List<ImdbTitle> TitlesAsProducer
		{
			get{return titlesAsProducer;}
			set{titlesAsProducer = value;}
		}

		public List<ImdbTitle> TitlesThankedIn
		{
			get{return titlesThankedIn;}
			set{titlesThankedIn = value;}
		}

		public List<ImdbTitle> TitlesAsSelf
		{
			get{return titlesAsSelf;}
			set{titlesAsSelf = value;}
		}
	}
}
