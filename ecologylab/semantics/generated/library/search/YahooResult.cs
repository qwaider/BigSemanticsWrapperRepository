//
// YahooResult.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2012 Interface Ecology Lab. 
//


using Simpl.Fundamental.Generic;
using Simpl.Fundamental.Net;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;
using ecologylab.collections;
using ecologylab.semantics.generated.library.search;
using ecologylab.semantics.metadata;
using ecologylab.semantics.metadata.builtins;
using ecologylab.semantics.metadata.scalar;
using ecologylab.semantics.metametadata;

namespace ecologylab.semantics.generated.library.search 
{
	[SimplInherit]
	public class YahooResult : Document
	{
		[SimplScalar]
		[SimplTag("Summary")]
		private MetadataString summary;

		[SimplScalar]
		[SimplTag("ModificationDate")]
		private MetadataString modificationDate;

		[SimplComposite]
		[SimplTag("Thumbnail")]
		[MmName("thumbnail")]
		private YahooThumbnail thumbnail;

		[SimplScalar]
		[SimplTag("MimeType")]
		private MetadataString mimeType;

		[SimplScalar]
		[SimplTag("RefererUrl")]
		private MetadataParsedURL refererUrl;

		public YahooResult()
		{ }

		public YahooResult(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataString Summary
		{
			get{return summary;}
			set
			{
				if (this.summary != value)
				{
					this.summary = value;
					this.RaisePropertyChanged( () => this.Summary );
				}
			}
		}

		public MetadataString ModificationDate
		{
			get{return modificationDate;}
			set
			{
				if (this.modificationDate != value)
				{
					this.modificationDate = value;
					this.RaisePropertyChanged( () => this.ModificationDate );
				}
			}
		}

		public YahooThumbnail Thumbnail
		{
			get{return thumbnail;}
			set
			{
				if (this.thumbnail != value)
				{
					this.thumbnail = value;
					this.RaisePropertyChanged( () => this.Thumbnail );
				}
			}
		}

		public MetadataString MimeType
		{
			get{return mimeType;}
			set
			{
				if (this.mimeType != value)
				{
					this.mimeType = value;
					this.RaisePropertyChanged( () => this.MimeType );
				}
			}
		}

		public MetadataParsedURL RefererUrl
		{
			get{return refererUrl;}
			set
			{
				if (this.refererUrl != value)
				{
					this.refererUrl = value;
					this.RaisePropertyChanged( () => this.RefererUrl );
				}
			}
		}
	}
}