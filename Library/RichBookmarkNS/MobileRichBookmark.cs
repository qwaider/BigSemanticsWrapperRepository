//
// MobileRichBookmark.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2012 Interface Ecology Lab. 
//


using Ecologylab.Collections;
using Ecologylab.Semantics.Generated.Library.GisNS;
using Ecologylab.Semantics.MetaMetadataNS;
using Ecologylab.Semantics.MetadataNS;
using Ecologylab.Semantics.MetadataNS.Builtins;
using Ecologylab.Semantics.MetadataNS.Scalar;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.Semantics.Generated.Library.RichBookmarkNS 
{
	[SimplInherit]
	public class MobileRichBookmark : Metadata
	{
		[SimplComposite]
		[SimplScope("repository_clippings")]
		[MmName("clipping")]
		private Clipping clipping;

		[SimplScalar]
		private MetadataDate time;

		[SimplComposite]
		[MmName("gis_location")]
		private GisLocation gisLocation;

		public MobileRichBookmark()
		{ }

		public MobileRichBookmark(MetaMetadataCompositeField mmd) : base(mmd) { }


		public Clipping Clipping
		{
			get{return clipping;}
			set
			{
				if (this.clipping != value)
				{
					this.clipping = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataDate Time
		{
			get{return time;}
			set
			{
				if (this.time != value)
				{
					this.time = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public GisLocation GisLocation
		{
			get{return gisLocation;}
			set
			{
				if (this.gisLocation != value)
				{
					this.gisLocation = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}