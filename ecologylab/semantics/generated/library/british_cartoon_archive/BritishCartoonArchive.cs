//
// BritishCartoonArchive.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator on 10/21/11.
// Copyright 2011 Interface Ecology Lab. 
//


using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;
using ecologylab.collections;
using ecologylab.semantics.metadata.builtins;
using ecologylab.semantics.metadata.scalar;
using ecologylab.semantics.metametadata;

namespace ecologylab.semantics.generated.library.british_cartoon_archive 
{
	/// <summary>
	/// This MMD was initially generated by the browser authoring tool
	/// </summary>
	[SimplInherit]
	public class BritishCartoonArchive : Document
	{
		/// <summary>
		/// Name of the artist, and period he lived
		/// </summary>
		[SimplScalar]
		private MetadataString artist;

		/// <summary>
		/// Name of the publication in which the cartoon appeared
		/// </summary>
		[SimplScalar]
		private MetadataString publishedIn;

		/// <summary>
		/// Date of the publication
		/// </summary>
		[SimplScalar]
		private MetadataDate publicationDate;

		/// <summary>
		/// Format of the publication
		/// </summary>
		[SimplScalar]
		private MetadataString publicationFormat;

		/// <summary>
		/// Cartoon Caption
		/// </summary>
		[SimplScalar]
		private MetadataString caption;

		[SimplScalar]
		private MetadataString referenceNumber;

		/// <summary>
		/// url of the image
		/// </summary>
		[SimplScalar]
		private MetadataString imgLocation;

		public BritishCartoonArchive()
		{ }

		public MetadataString Artist
		{
			get{return artist;}
			set{artist = value;}
		}

		public MetadataString PublishedIn
		{
			get{return publishedIn;}
			set{publishedIn = value;}
		}

		public MetadataDate PublicationDate
		{
			get{return publicationDate;}
			set{publicationDate = value;}
		}

		public MetadataString PublicationFormat
		{
			get{return publicationFormat;}
			set{publicationFormat = value;}
		}

		public MetadataString Caption
		{
			get{return caption;}
			set{caption = value;}
		}

		public MetadataString ReferenceNumber
		{
			get{return referenceNumber;}
			set{referenceNumber = value;}
		}

		public MetadataString ImgLocation
		{
			get{return imgLocation;}
			set{imgLocation = value;}
		}
	}
}
