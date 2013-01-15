//
// BritishCartoonArchive.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2013 Interface Ecology Lab. 
//


using Ecologylab.Collections;
using Ecologylab.Semantics.Generated.Library.CartoonNS;
using Ecologylab.Semantics.MetaMetadataNS;
using Ecologylab.Semantics.MetadataNS.Builtins;
using Ecologylab.Semantics.MetadataNS.Scalar;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.Semantics.Generated.Library.CartoonNS 
{
	[SimplInherit]
	public class BritishCartoonArchive : Cartoon
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

		[SimplScalar]
		private MetadataString referenceNumber;

		public BritishCartoonArchive()
		{ }

		public BritishCartoonArchive(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataString Artist
		{
			get{return artist;}
			set
			{
				if (this.artist != value)
				{
					this.artist = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString PublishedIn
		{
			get{return publishedIn;}
			set
			{
				if (this.publishedIn != value)
				{
					this.publishedIn = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataDate PublicationDate
		{
			get{return publicationDate;}
			set
			{
				if (this.publicationDate != value)
				{
					this.publicationDate = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString PublicationFormat
		{
			get{return publicationFormat;}
			set
			{
				if (this.publicationFormat != value)
				{
					this.publicationFormat = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString ReferenceNumber
		{
			get{return referenceNumber;}
			set
			{
				if (this.referenceNumber != value)
				{
					this.referenceNumber = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
